# type handler

Just an approach to avoid multiples if's statements when you have to select different objects that inherit from a commom interface using a parameter to select them.

In this example, we have two differents bank accounts types that inherit from the same interface, but each one have its own actions (like debit or credit actions, for example).

If we use if's statements for validate each account type, our code will be poluted and difficult to read.

``` java
if(accountTypeNumber == "1")
  account.setAvailableActions(["debit"]);
if(accountTypeNumber == "2")
  account.setAvailableActions(["debit", "credit"]);
if(accountTypeNumber == "n")
  so on
``` 

So we link each account type number to its account type, and then the magic happens.

``` java
account.setAvailableActions(AccountTypeMapping.getActions(accountTypeNumber));
```

Please feel free to use this code and tell me if you know how to improve it :)
