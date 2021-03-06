package upskills.autotagging.model;
// Generated Sep 27, 2017 2:16:10 PM by Hibernate Tools 4.3.1



/**
 * TradeId generated by hbm2java
 */
public class TradeId  implements java.io.Serializable {


     private String field;
     private int nb;

    public TradeId() {
    }

    public TradeId(String field, int nb) {
       this.field = field;
       this.nb = nb;
    }
   
    public String getField() {
        return this.field;
    }
    
    public void setField(String field) {
        this.field = field;
    }
    public int getNb() {
        return this.nb;
    }
    
    public void setNb(int nb) {
        this.nb = nb;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TradeId) ) return false;
		 TradeId castOther = ( TradeId ) other; 
         
		 return ( (this.getField()==castOther.getField()) || ( this.getField()!=null && castOther.getField()!=null && this.getField().equals(castOther.getField()) ) )
 && (this.getNb()==castOther.getNb());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getField() == null ? 0 : this.getField().hashCode() );
         result = 37 * result + this.getNb();
         return result;
   }   


}


