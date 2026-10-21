public String encuentraOperadores (String operacion){
    String operador = "";

    for(int i = 0; i < operacion.length(); i++){
        char c = operacion.charAt(i);
        if(c == '+'  || c == '-' || c == '*' || c == '/' ){
            operador += c;
        }
    }
    return operador;
}
