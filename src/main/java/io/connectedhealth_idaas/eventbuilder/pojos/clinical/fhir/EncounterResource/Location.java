package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.EncounterResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Location {


    public String reference;

    public String getReference(){return reference;}
    public void setReference(String reference){this.reference=reference;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}