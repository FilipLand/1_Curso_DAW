/* 3. Realiza un script que devuelva un contador descendente desde 10 hasta 0 y cuando 
llegue a 0 aparezca una nueva ventana con el texto “BOOM”*/

var contador = 10;
var cantidad;
var i;

if(confirm("Estas seguro para empezar la cuenta atras")){
    cantidad = contador;
  for (i = 0; i< contador; i++){
    alert(cantidad);
    cantidad = cantidad - 1;
    }
    var ventana = window.open("","","width=50,heigth=50"); 
    ventana.document.write("<h1>BOOM!!!</h1>") 
} else {
  alert("El programa a acabado");
}

