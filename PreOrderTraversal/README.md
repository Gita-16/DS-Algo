# PREORDER TRAVERSAL
Our main aim is to talk about Preorder Traversal but before moving to that let us first disscuss few points of TREE TRAVERSAL.
## REQUIREMENTS FOR TRAVERSING TREE

We need Left,right and root pointers to traverse up and down or sideways in a tree.

## ARRANGEMENTS OF POINTERS
Left pointer and Right pointer is fixed i.e,right pointer will always comes after left pointer.

                LEFT-->RIGHT        (FIXED)

But Root is not fixed,it can appear anywhere like:

            ? --> Left --> ? --> Right --> ?

 based on this tree traversal are of three types

 ## TREE TRAVERSING WAYS

        PREORDER:  ROOT-->Left-->Right

        INORDER:   Left-->ROOT-->Right

        POSTORDER: Left-->Right-->ROOT

 ## PREORDER TRAVERSAL(Two Approach):

 RECURSION: In recursion method, system maintains  call stack(inbuilt).

 ITERATIVE: In iterative method we need to maintain our own stack.

 ## CREATION OF TREE
 Now, we will create a tree like this
 ![](/images/treeimg.png)

 and here we write a method to create our tree.

    public void createTree() {

        root = new TreeNode(5);

        root.left = new TreeNode(4);

        root.right = new TreeNode(6);

        root.left.left = new TreeNode(3);

        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(8);

    }

## THEORITICAL TREE TRAVERSAL
So, here is the image of a tree and arrows shows the direction in which order we have to move.
![](/images/theoriticalTreeTraversal_img.png)
We print the node in the way we proceed and  encounter a new node.

## MECHANISM/ALGORITHM  OF ITERATIVE APPROACH
VIST NODE:
* STEP 0: If the root node is null than return.
* STEP 1: If root node is not NULL ,make a stack and  simply push the root  into the stack.
* STEP 2: Check whether the stack is empty or not,
if no move to STEP 3 otherwise move to STEP 6.
* STEP 3:Retrieve top and print top element.
* STEP 4:Check existence of stack,if found push in stack.
* STEP 5:Check existence of stack,if found push in stack
* STEP 6:END

## FUNCTION FOR PREORDER TRAVERSAL
     public void iterativePreorder() {
        TreeNode top;
        if (root == null)
            return;

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

         
        while (!st.empty()) {
            top = st.pop();
            System.out.print(top.data + " " );
            if (top.right != null)
                st.push(top.right);
            if (top.left != null)
                st.push(top.left);
        }
    }



## PICTORIAL PREORDER TRAVERSAL  
STEP 1:
![](/images/pushRootInStack.png)
STEP 3 - STEP 5(performs repeatedly)
* Iteration 1
![](/images/iteration1.png)
* Iteration 2
![](/images/iteration2.png)
* Iteration 3
![](/images/iteration3.png)
* Iteration 4
![](/images/iteration4.png)
* Iteration 5
![](/images/iteration5.png)
* Iteration 6
![](/images/iteration6.png)
* STEP 6:
![](/images/stackEmpty.png)

Stack is empty the control comes out of the while loop and the process ends.






 




