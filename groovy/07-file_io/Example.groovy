import java.io.File 
/*

    java.io.File
    java.io.InputStream
    java.io.OutputStream
    java.io.Reader
    java.io.Writer

*/
class Example { 
   static void readFile(String filez){
      new File(filez).eachLine {  
         line -> println("line : $line");
      } 
   }

   static void writeFile(String pathz, String filez, String contentz){
       new File(pathz, filez).withWriter('utf-8') {
           writer -> writer.writeLine(contentz)
       }
   }
   static void sizeFile(String filez){
       File file = new File(filez);
       println("the file ${file.absolutePath} has ${file.length()} bytes");
   }
   static void testingz(String pathz){
       def file = new File(pathz);
       println("File? ${file.isFile()}");
       println("Directory? ${file.isDirectory()}");
   }
   static void main(String[] args) {
       String read_file = '/vagrant/07-file_io/testfilez'
       String write_path = '/vagrant/07-file_io/'
       String write_file = 'testfilew'
       readFile(read_file);
       writeFile(write_path, write_file, 'TEstingz zhe content 1');
       sizeFile(read_file)
       testingz(read_file)
   }
}