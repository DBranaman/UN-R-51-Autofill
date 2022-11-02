public class SOP {
    private String prefix;
    private Integer number;

    private Integer attachment;
    private Integer version;
    private String title;

    public SOP(String prefix, int number, int version, String title) {
        this.prefix = prefix;
        this.number = number;
        this.version = version;
        this.title = title;
    }

    public SOP(String prefix, Integer number, Integer attachment, Integer version, String title) {
        this.prefix = prefix;
        this.number = number;
        this.attachment = attachment;
        this.version = version;
        this.title = title;
    }

    public String getPrefix() {
        return prefix;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getAttachment(){
        return attachment;
    }

    public Integer getVersion() {
        return version;
    }

    public void newVersion() {
        this.version++;
    }

    public String getTitle() {
        return title;
    }

    public Boolean hasAttachment(){
        if(this.getAttachment() == null){
            return false;
        }

        return true;
    }


    public String getSOPName(){
        String name = "";
        name += this.getPrefix() + "-";
        if(this.getNumber() < 100) {
            name += "0";
        }
        name+= this.getNumber().toString() + ".";
        if(this.hasAttachment()){
            name+= "AT";
            if(this.getAttachment() < 10){
                name+= "0";
            }
            name+= this.getAttachment().toString() + ".";
        }
        if(this.getVersion() < 10){
            name+= "0";
        }
        name+= this.getVersion().toString() + " ";
        name+= this.getTitle();

        return name;
    }
}
