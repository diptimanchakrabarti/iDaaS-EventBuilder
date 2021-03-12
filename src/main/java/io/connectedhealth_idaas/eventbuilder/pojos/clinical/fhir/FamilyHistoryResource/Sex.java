package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.FamilyHistoryResource;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PatientResource.Coding;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Sex {

    public List<Coding> coding;
    public String text;

    public List<Coding> getCoding(){return coding;}
    public void setCoding(List<Coding> coding){this.coding=coding;}

    public String getText(){return text;}
    public void setText(String text){this.text=text;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
