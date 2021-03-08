# Outfit Generator

## Class Hierarchy

[Diagram of Hierarchy](https://lucid.app/lucidchart/4187b31b-e401-43db-8dec-9d048630b032/edit?page=0_0#?folder_id=home&browser=icon)

Below is the programs class hierarchy
- Clothing:
	- Pant:
		- Jean
		- Khaki
		- Short
		- Slack
	- Outwear:
		- Jacket
		- Raincoat
		- Wintercoat
	- Shirt:
		- ButtonShirt
		- Sweater
		- Tshirt
		- TurtleNeck
	- Shoe:
		- Boot
		- DressShoe
		- RunningShoe
		- Trainer
- Accessory:
		- Earring
		- Ring
		- Tie
		- Watch

The following classes are set to abstract as we'll never create instances of these them, **Clothing**, **Pant**, **Outerwear**, **Shirt**, **Shoe** and **Accessory**.

There are also three Interface classes used in the program:

**ClothingMatches**: These methods are methods that any subclass of Clothing or Accessory requires as the methods are applicable to every item that makes up an outfit (e.g isPlain(), isFancy(), isCasual() etc.)

**ShoeMethods**: Certain items of clothing need to match the **Shoe** you pair it with, so an interface of shoe specific methods were created that are implemented by the **Shirt** and **Pant** classes (eg. isGoodWithBoots(), isGoodWithDressShoes()).

**AccessoryMethods**: Similar to the **ShoeMethods** Interface, this is implemented by the **Shirt** and **Pant** classes to check if these subclasses match the **Accessory** being worn.


# How a Good Outfit is determined

Inside our **OutfitGenerator** class we have two methods used to output an outfit combination.

**randomOutfitCombo()**: A random item from each of our 5 ArrayLists that hold each item class (eg. Pant, Shoe, Accessory etc.) and it then checks if the random 5 items are a match by running a number of boolean methods that return a value of true if they are a matching combination or false if not.

**generateMatchingOutfitCombo()**: This will perform the exact same actions as the above method except if the returned outfit does not match, the method will call itself again and again until a matching combination is found.



The following methods are used to determine if an outfit matches:

**isOutiftPlain()**: Takes a **Shirt**, **Pant** and **Shoe** class and checks if they are all plain i.e if none of the items are either "yellow", "green", "red" or "blue".

**isWinterCoatWithShorts()**: This returns true if the outfit has chosen a **Short** as it's choice of **Pant** and if the the **Outerwear** has a integer **thermalRating** that is greater than or equal 3. If both these conditions return true then we know that the **Pant** is not appropriate with the choice of **Outerwear**

**isBlueAndGreenPresent()**: If at least two of the items Shirt, Pant and Outerwear are "blue" and "green" then this will return true as "blue" and "green" should not be worn together here.

**matchesAccessory()**: This method checks the subclass of the **Accessory** that we've chosen to pair with our outfit. Depending on the subclass chosen, we then run a set of boolean methods to check if it goes with the outfit.
For example, if the **Accessory** subclass is a **Tie**, then we'll check if it matches the **Shirt** and **Pant** by running **isGoodWithTie()** on both the **Shirt** and **Pant** class

**matchesShoes()**: Similar to the above method, this method checks what subclass of **Shoe** the outfit has chosen to pair up with and then run specific methods on the chosen **Shirt** and **Pant** to see if they match.