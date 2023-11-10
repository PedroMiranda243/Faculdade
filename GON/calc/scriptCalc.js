function inserir(valor) {
    var x = document.getElementById('tela').innerHTML;
    document.getElementById('tela').innerHTML = x + valor
}

function limpar() {
    document.getElementById('tela').innerHTML = "";
}

function voltar() {
    var x = document.getElementById('tela').innerHTML;
    document.getElementById('tela').innerHTML = x.substring(0, x.length -1)
}

function calcular() {
    var x = document.getElementById('tela').innerHTML;
    if(x){
        document.getElementById('tela').innerHTML = eval(x)
    } else{
        document.getElementById('tela').innerHTML = 'Precisa dos numeros'
    }
}





