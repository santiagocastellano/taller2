/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author santi
 */
public class Taller2 {
    private interface Producto{
        void propiedades(String nombre, float precio, String descrip);
        void print();
        float getPrecio();
        String getNombre();
    }
    private class Bebida implements Producto{

        @Override
        public String getNombre() {
            return nombre;
        }

        public String getDescrip() {
            return descrip;
        }

        @Override
        public float getPrecio() {
            return precio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescrip(String descrip) {
            this.descrip = descrip;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }
        
        private String nombre, descrip;
        private float precio;
        @Override
        public void propiedades(String nombre, float precio, String descrip) {
            this.nombre=nombre;
            this.precio=precio;
            this.descrip=descrip;
        }
        @Override
        public void print(){
            System.out.println("Nombre: "+ this.nombre+"///"+this.descrip+"///"+"Precio: $"+this.precio);
        }
        
    }
    private class Shampoo implements Producto{

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescrip(String descrip) {
            this.descrip = descrip;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        public String getDescrip() {
            return descrip;
        }

        @Override
        public float getPrecio() {
            return precio;
        }
        
        private String nombre, descrip;
        private float precio;
        @Override
        public void propiedades(String nombre, float precio, String descrip) {
            this.nombre=nombre;
            this.precio=precio;
            this.descrip=descrip;
        }
        @Override
        public void print(){
            System.out.println("Nombre: "+ this.nombre+"///"+this.descrip+"///"+"Precio: $"+this.precio);
        }
        
    }
    private class Verduleria implements Producto{
        private String nombre, descrip;
        private float precio;

        @Override
        public String getNombre() {
            return nombre;
        }

        public String getDescrip() {
            return descrip;
        }

        @Override
        public float getPrecio() {
            return precio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescrip(String descrip) {
            this.descrip = descrip;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }
        
        @Override
        public void propiedades(String nombre, float precio, String descrip) {
            this.nombre=nombre;
            this.precio=precio;
            this.descrip=descrip;
        }
        @Override
        public void print(){
            System.out.println("Nombre: "+ this.nombre+"///"+"Precio: $"+this.precio+"///"+this.descrip);
        }
        
    }
    
    private Producto[] sortArrayAsc(Producto[] arrayProd){
        Producto productAux;//declaro un objeto de transicion
        int countProd=arrayProd.length;//para mejor claridad almaceno el tamaño del array dentro de una variable
        for(int i=0;i<countProd-1;i++){//recorro el array hasta la anteultima posicion
            for (int j=i+1;j<countProd;j++){//recorro el array desde la segunda posicion hasta la ultima
                //comparo la posicion actual con las que siguen, si es mayor, se troca
                if(arrayProd[i].getPrecio()>arrayProd[j].getPrecio()){ 
                    productAux= arrayProd[i];
                    arrayProd[i]=arrayProd[j];
                    arrayProd[j]=productAux;
                }
            }
        }// fin del for
        return arrayProd;
    }
    private Producto[] setContent(){

        Producto producto1= new Bebida();
        producto1.propiedades("Coca-Cola Zero",20,"Litros:1.5");
        Producto producto2= new Bebida();
        producto2.propiedades("Coca-Cola",18,"Litros:1.5");
        Producto producto3= new Shampoo();
        producto3.propiedades("Shampoo Sedal",30,"Contenido:500mm");
        Producto producto4= new Verduleria();
        producto4.propiedades("Frutillas",64,"Unidad de venta: kilo");
        
        Producto[] arrayProd=new Producto[4];
        arrayProd[0]=producto1;
        arrayProd[1]=producto2;
        arrayProd[2]=producto3;
        arrayProd[3]=producto4;
        
        return arrayProd;
     
    }
    private void print(){
        //llamo al metodo para cargar el array
        Producto[] producto= setContent();
        for (Producto producto1 : producto) producto1.print();

        System.out.println("================================================================");
        //ordeno el array (tambien podria analizarse el mayor y el menor recorriendo el
        //vector y guardando en una variable el numero mas grande o mas chico hasta llegar al final)
        producto=sortArrayAsc(producto);
        //el producto mas caro sera el ultimo del array ordenado ascendentemente
        //supongo que no se el tamaño del array...
        System.out.println("Producto mas caro: "+ producto[producto.length-1].getNombre());
        //el mas barato sera el primero, todo array comienza con indice 0
        System.out.println("Producto mas caro: "+ producto[0].getNombre());
        
    }
    public static void main(String[] args) {
        Taller2 taller= new Taller2();
        taller.print();
        // TODO code application logic here
    }
    
}
