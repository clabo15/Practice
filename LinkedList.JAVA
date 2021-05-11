//Given a singly linked list of integers l and an integer k, remove all elements from list l that have a 
//value equal to k.

//Given
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
	//Write Code Here
    if (l == null)
        return null;

    l.next = removeKFromList(l.next, k);

    if (l.value == k)
        return l.next;

    return l;
    
}
