package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.PractitionerResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Name {
    public String family;
    public List<String> given;
    public List<String> prefix;

    public String getFamily(){return family;}
    public void setFamily(String family){this.family=family;}

    public List<String> getGiven(){return given;}
    public void setGiven(List<String> given){this.given=given;}

    public List<String> getPrefix(){return prefix;}
    public void setPrefix(List<String> given){this.prefix=prefix;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
