# Practice
This is a collection of practice solutions


## Sum Of Two Numbers
The function "add" has two parameters "param1" and "param2."
The addition of "param1" and "param2" are stored int the constant variable result.
The addition of the two paramaters is returned by returning "result"



## First Duplicate Number
The given function is "int firstDuplicate(int[] a)."
The for loop initializes "i" = 0 and increments until "i" is equal to "a.length" to parse through the array.
An if statement is made to check if there is a duplicate number and if so, the duplicate number of the smaller index is returned.
If there are no such duplicates, -1 is returned.



## Non-Repeating Character
The given function is "char firstNotRepeatingCharacter(String a)"
The for loop will initialize "i" = 0 and increments until "i" is equal to "s.length()" to parse through the string array.
An if statment is made to check if the indexOf the character at "i" equals to the lastIndexOf the character at "i" and if they equal, then a non repeating character is found and the character at that index "i" is returned.
If they do not equal, then no non-repeating indexes are found and the underscore character is returned.



## Linked List Remove
Given the linked list function is "ListNode<Integer> removeKFromList(ListNode<Integer> l, int k)."
An if statment is made to check if the value of "l" is null (empty) and if it is, a value of null is returned.
The next node of l, "l.next," is set equal to "removeKFromList(l.next, k)" to remove any accurence of the node l that equals the value of k.
If the value of the node l, "l.value," equals the value of k, then l.next is returned, removing the element from the list l.
If there are no values in the list l equal to the value of k, then the list l is returned.
