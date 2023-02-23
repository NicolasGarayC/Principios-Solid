package com.mycompany.principioliskov;

import java.util.ArrayList;
import java.util.List;

public class PrincipioLiskov {

    public static void main(String[] args) {
        List<RecursoPersistente> recursos = new ArrayList<>();
        recursos.add(new ConfiguracionHoraria());
//        Configuracion configuracion<> = new Configuracion();
//        configuracion.cargarConfiguracion();
//        configuracion.salvarConfiguracion();
    }
}
