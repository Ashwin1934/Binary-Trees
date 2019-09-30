public class Runner{

	public static void main (String [] args){

		TreeSet<Character> tSet = new TreeSet<Character>();
		//asci average
		int avg = 0;

		for (int i =0;i<30;i++)
			tSet.add((char) ((int)((Math.random() * 25) + 97)));


		TreeSet<Character> preSet = new TreeSet<Character>();
		TreeSet<Character> inSet = new TreeSet<Character>();
		TreeSet<Character> postSet = new TreeSet<Character>();


		String preOrder = tSet.preOrder();
		String inOrder = tSet.inOrder();
		String postOrder = tSet.postOrder();

		for (int i = 1; i < inOrder.length()-1; i+=3){
			inSet.add(inOrder.charAt(i));
			avg+= (int) (inOrder.charAt(i));
		}

		for (int i = 1; i < preOrder.length()-1; i+=3)
			preSet.add(preOrder.charAt(i));

		for (int i = 1; i < postOrder.length()-1; i+=3)
			postSet.add(postOrder.charAt(i));


		avg/=tSet.numsSize();
		System.out.println ("Avg ASCII: " + avg);
		System.out.println ("Avg Character: " + ((char)(avg)));
		System.out.println ("Size: " + tSet.numsSize());


		System.out.println ("\nOriginal Preorder: " + preOrder);
		System.out.println ("Original Inorder: " + inOrder);
		System.out.println ("Original Postorder: " + postOrder);

		System.out.println ("\nPreSet Preorder: " + preSet.preOrder());
		System.out.println ("PreSet Inorder: " + preSet.inOrder());
		System.out.println ("PreSet Postorder: " + preSet.postOrder());

		System.out.println ("\nIOset Preorder: " + inSet.preOrder());
		System.out.println ("IOset Inorder: " + inSet.inOrder());
		System.out.println ("IOset Postorder: " + inSet.postOrder());

		System.out.println ("\nPostSet Preorder: " + postSet.preOrder());
		System.out.println ("PostSet Inorder: " + postSet.inOrder());
		System.out.println ("PostSet Postorder: " + postSet.postOrder());

		System.out.println ();

	}
}