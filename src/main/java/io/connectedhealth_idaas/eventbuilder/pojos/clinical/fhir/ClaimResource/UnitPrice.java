package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UnitPrice {

    public double value;
    public String currency;

    public double getValue(){return value;}
    public void setValue(double value){this.value=value;}

    public String getCurrency(){return currency;}
    public void setCurrency(String currency){this.currency=currency;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
