package biblioteca;

import javax.swing.JOptionPane;

public class Biblioteca {
    public static void main(String[] args)  {
        
      Livro livro1 = new Livro(1, "O Quatrilho", "Zé", 344, false);
      
        System.out.println(livro1.isDisponivel());
      Usuario pedro = new Usuario(11, "Pedro", "pedro@oi.com", "1234");
      
      try{
         pedro.retirar(livro1);
         
      }catch(ValidaException ex){
          System.out.println(ex.getMessage());
      }
      
      
      
      

    }

}
