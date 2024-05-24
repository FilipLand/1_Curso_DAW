var tiempoInicio = new Date().getTime();
function Hola () {
/*var tiempo = parseInt(prompt("Introduce el tiempo"));
for (var i = 0; i < tiempo; i++){
var resultado = i;
}
alert (resultado);*/
var tiempoFinal = new Date().getTime();

var tiempoTranscurrido = tiempoFinal - tiempoInicio;
parseFloat(tiempoTranscurrido);
tiempoTranscurrido = tiempoTranscurrido / 1000
alert("Tiempo que paso "+ tiempoTranscurrido+ " s");
} 