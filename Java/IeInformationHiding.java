/*Public and protected methods within a class with private datafields are the only ones that can access such variables. So it is not wrong to say that the only way to access private
variables in a class it through their methods.

These private datafields are unaccesible to even the subclasses of that class. They cannot be altered directly like: Class.idNum = 12; , but through the set and get methods that have 
access to them

If you want a subClass to have access to their parent's datafields directly you then have to set the datafields as protected, which allows its direct manipulation only by its subclasses

The subclasses that can access this kind of datafields are called fragile because they are easy to "break"
*/

