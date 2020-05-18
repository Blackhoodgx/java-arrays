
package arrays;

 // @author joao brilhante
 
public class Arrays {

 
    public static void main(String[] args) {
      
        String [] playstation ={"PS1","PS2","PS3","PS4"};
        String [] nintendo ={"NES","SNES","nintedo64","gamecube"};
         String [] xbox ={"xbox","xbox360","xbox one","x xbox S"};
        
        String [][] ver = {playstation, nintendo, xbox};
         
          String [] umaDimençao = {"uma", "duas", "tres"}; //  é um array de uma dimesao
          
        String [][] marcas = { 
            {"PS1","PS2","PS3","PS4"}, 
            {"NES","SNES","nintedo64","gamecube"}, 
            {"xbox","xbox360","xbox one","x xbox S"} 
        };
        
        
// o array marcas neste caso é de duas porque os seu elementos (playstation, nintendo, xbox) ja era array,
/*
String [][] marcas = {playstation, nintendo, xbox};
String [][] marcas = { {"PS1","PS2","PS3","PS4"}, {"NES","SNES","nintedo64","gamecube"}, {"xbox","xbox360","xbox one","x xbox S"} };
os dois array de cima sao a mesma coisa de maneiras diferentes, o segundo pode ainda repesentar se doutra forma

String [][] marcas = {playstation, 
                      nintendo, 
                      xbox};


String [][] marcas = { {"PS1","PS2","PS3","PS4"},                                    
                       {"NES","SNES","nintedo64","gamecube"},                   
                       {"xbox","xbox360","xbox one","x xbox S"} }; 

com este segundo consegues ver melhor a localiçao de cada elemento ou seja o X e o Y, vez desta forma

          x                        x  
marca = y 0 1 2     y marcas = { {"PS1","PS2","PS3","PS4"},                                    
          1                      {"NES","SNES","nintedo64","gamecube"},                   
          2                      {"xbox","xbox360","xbox one","x xbox S"} }; 
    
o y representa em que linha esta  a playstation, a nintendo e xbox
o x representa em que coluna esta cada consola

----------------------------------
outra forma de ver é assim 

String [] playstation ={"PS1","PS2","PS3","PS4"}; x repesenta a consola



String [] playstation ={"PS1","PS2","PS3","PS4"}; 
String [] nintendo ={"NES","SNES","nintedo64","gamecube"};
String [] xbox ={"xbox","xbox360","xbox one","x xbox S"};

x ainda vai representar a consola , mas o y diz de que marca é

ou seja marca[y][x] porque primero queres saber a marca da consola antes de querer saber que consola é
ou seja andes de dizeres é uma PS2 tem de dizer é uma consola da playstation

     

          x                        x  
marca = y 0 1 2     y marcas = { {"PS1","PS2","PS3","PS4"},                       String [][] marcas = {playstation, 
          1                      {"NES","SNES","nintedo64","gamecube"},                                 nintendo,                      
          2                      {"xbox","xbox360","xbox one","x xbox S"} };                            xbox;}
                     
y qual é a marca?
x qual é a consola?
    

desta forma vez que:
System.out.println(marcas[0][1]); é a PS2 por o y = 0 e o x = 1
System.out.println(marcas[1][0]) é a NES por o y = 1 e o Y = 0
System.out.println(marcas[2][2]); da me a xbox one por x = 2 e o Y = 2

*/
             
        System.out.println(marcas[0][1]);
        System.out.println(marcas[1][0]);
        System.out.println(marcas[2][2]);
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        
       
        for (int y = 0; y < marcas.length; y++) {
            String[] consola = marcas[y];
            for (int x = 0; x < consola.length; x++) {
                String mostrar = consola[x];
                System.out.println(" mostra me a consola " + mostrar);
                
            }
            
            System.out.println("---------------------------------------");
                    
            }

         /*   o que o primero for esta a dizer para a marca na pociçao y vou fazer algo
          neste caso o que o o que ele vai fazer e outro for e este novo for diz para  para a consola na posiçao x vou fazer
            
            */
         
           
        System.out.println("///////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////");
        
        for (String[] marca : marcas) {
            for (String consola : marca) {
                
                System.out.println(" mostra me a consola "+consola);
                
            }
             System.out.println("************************************");
        }
        
       
        
    } 
    }
    

