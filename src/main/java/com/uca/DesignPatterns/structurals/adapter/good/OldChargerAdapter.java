package com.uca.DesignPatterns.structurals.adapter.good;

public class OldChargerAdapter implements NewCharger {
    private OldChargerGood oldCharger;

    public OldChargerAdapter(OldChargerGood oldCharger) {
        // Cambiamos la instancia del cargador viejo por el adaptador
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithUSBTypeC() {
        // Adaptamos la llamada al metodo del cargador viejo
        oldCharger.charge();
    }
}
