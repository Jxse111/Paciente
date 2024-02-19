/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paciente;

/**
 *
 * @author José
 */
public class Paciente {

    // Atributos 
    private String nombrePaciente = "";
    private double gastoAcumulado = 0.0;
    private int numPinchazos = 0;

    /**
     * Este constructor devuelve 3 parametros, el nombre, el gasto acumulado y
     * el numero de pinchazos.
     *
     * @param nombre el nombre del paciente
     * @param gastoAcumulado el gasto acumulado
     * @param numPinchazos el número de pinchazos
     * @throws IllegalArgumentException cuando los datos introducidos para gasto
     * acumulado y numero de pinchazos es negativo
     */
    //Constructor/es
    public Paciente(String nombre, double gastoAcumulado, int numPinchazos) throws IllegalArgumentException {
        if (gastoAcumulado < 0) {
            throw new IllegalArgumentException(String.format("ERROR: Datos iniciales erróneos: %.2f",
                    gastoAcumulado));
        } else if (numPinchazos < 0) {
            throw new IllegalArgumentException(String.format("ERROR: Datos iniciales erróneos: %d",
                    numPinchazos));
        }
        this.nombrePaciente = nombre;
        this.gastoAcumulado = gastoAcumulado;
        this.numPinchazos = numPinchazos;
    }

    //Métodos getter y otros métodos
    /**
     * @return devuelve el nombre del paciente
     */
    public String getNombrePaciente() {
        return this.nombrePaciente;
    }

    /**
     * @return devuelve el gasto acumulado
     */
    public double getGastoAcumulado() {
        return this.gastoAcumulado;
    }

    /**
     * @return devuelve el numero de pinchazo
     */
    public int getNumPinchazos() {
        return this.numPinchazos;
    }

    /**
     * Método de clase que devuelve el gasto acumulado actualizado
     *
     * @param numPinchazosHoy el número de pinchazos de hoy
     * @param importePinchazo el importe de cada pinchazo
     * @return Devuelve true si la operacion es correcta
     */
    public boolean actualizarGastoAcumulado(int numPinchazosHoy, float importePinchazo) {
        if (numPinchazosHoy < 0 || importePinchazo < 0) {
            return false;
        }
        if (numPinchazosHoy > 0 && importePinchazo > 0.0) {
            this.numPinchazos += numPinchazosHoy;
            this.gastoAcumulado += numPinchazosHoy * importePinchazo;
        }
        return true;
    }

    /**
     * Método de clase que devuelve el tipo de paciente segun su gasto acumulado
     *
     * @return el mensaje con el tipo de paciente en base a su gasto acumulado
     */
    public String tipoPaciente() {
        String mensaje = "";
        if (this.gastoAcumulado > 0.0 && this.gastoAcumulado <= 4000.0) {
            mensaje = "Estandar";
        } else if (this.gastoAcumulado > 4000.0 && this.gastoAcumulado <= 7750.0) {
            mensaje = "Interesante";
        } else if (this.gastoAcumulado > 7750.0 && this.gastoAcumulado <= 10000.0) {
            mensaje = "Muy interesante";
        } else if (this.gastoAcumulado > 10000.0) {
            mensaje = "Premium";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return String.format("Paciente: %s, número de pinchazos: %d, gasto acumulado: %.2f",
                this.nombrePaciente, this.numPinchazos,
                this.gastoAcumulado);
    }

}
