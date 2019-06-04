package com.redsamurai.view.beans;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class Main {
    public Main() {
        super();
    }

    public void handleValueChange(ValueChangeEvent valueChangeEvent) {
        String clientId = valueChangeEvent.getComponent().getClientId(FacesContext.getCurrentInstance());

        ExtendedRenderKitService erks =
            Service.getService(FacesContext.getCurrentInstance().getRenderKit(), ExtendedRenderKitService.class);
        erks.addScript(FacesContext.getCurrentInstance(), "passClientSideValue('" + clientId + "')");
    }
}
