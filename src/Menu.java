import javax.swing.*;

public class Menu {
    public int menu(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("MENU\n"+
                "1. añadir empleado \n"+
                "2. buscar empleado \n"+
                "3. cantidad Mayor \n"+
                "4. cantidad menor\n"));

        return opc;
    }
}
