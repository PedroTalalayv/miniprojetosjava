public class Livro{ 

 private int id;
 private String name;
 private String genero;

 public Livro(int id, String name, String genero){
    this.id = id;
    this.name = name;
    this.genero = genero;
 }

 public int getId() {
    return id;
 }
 public void setId(int id) {
    this.id = id;
 }
 public String getName() {
    return name;
 }
 public void setName(String name) {
    this.name = name;
 }
 public String getGenero() {
    return genero;
 }
 public void setGenero(String genero) {
    this.genero = genero;
 }

 @Override
 public String toString() {
   return "Livro [id=" + id + ", name=" + name + ", genero=" + genero + "]";
 }


}