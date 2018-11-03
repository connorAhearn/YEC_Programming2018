
public class ADDITEM_Test2 {

	public static void main(String[] args) {
		Store s= new Store();
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
                AddItem a = new AddItem(s);
            }
        });
	}

}
