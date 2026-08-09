```java
class ReplaceCharacter
{
    public static void main(String args[])
    {
        String str = "Java";

        String newString = str.substring(0, 2) + "w" + str.substring(3);

        System.out.println("Original String: " + str);
        System.out.println("New String: " + newString);
    }
}
```
