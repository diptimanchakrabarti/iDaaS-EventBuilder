package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ObservationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Specimen {
    public String reference;
    public String display;

    public String getReference(){return reference;}
    public void setReference(String reference){this.reference=reference;}

    public String getDisplay(){return display;}
    public void setDisplay(String display){this.display=display;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
