/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package encriptador;

/**

 @author Arlen
 */
public class NewMain
{

    /**
     @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
    }
       public static String encriptar(String msg,String key){
        
        StringBuilder cri = new StringBuilder();
        int k_ind = 0, key_len = key.length();
        for(int letra = 0; letra < msg.length(); letra++)
        {
            cri.append(msg.charAt(letra));
            cri.append(key.charAt(k_ind++));
            if(k_ind == key_len)
            {
                k_ind = 0;
            }
        }
        return cri.toString();
        
    
    }
   

    
    
}
