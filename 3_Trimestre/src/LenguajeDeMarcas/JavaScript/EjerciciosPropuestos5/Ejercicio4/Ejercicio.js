/* Crear un script que permita, mediante un botón llamado 
“Abrir Ventana” crear una nueva ventana de fondo azul dimensionable 
y con barras de scroll. Debemos cambiar el foco a la nueva ventana. 
En la nueva ventana debe existir otro botón llamado “Cerrar Ventana” debe cerrar la ventana.*/

function abrirVentana() {
var nuevaVentana = window.open("","","width=50,heigth=50, resizable=yes,scrollbars=yes");
nuevaVentana.document.write("<body bgcolor=blue><h1>Hola</h1></body>");
}