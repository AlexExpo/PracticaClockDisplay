

public class ClockDisplay
{
    
    private NumberDisplay hora;
    
    private NumberDisplay minuto;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
    }
    public void fijarHora(int nuevaHora, int nuevoMinuto)
    {
        hora.setValue(nuevaHora);
        minuto.setValue(nuevoMinuto);
    }
    public void avanzarMinuto()
    {
        minuto.increment();
        if(minuto.getValue() == 0) {
            hora.increment();
        }
    }
    public String mostrarHora()
    {
        return hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }

    
}
