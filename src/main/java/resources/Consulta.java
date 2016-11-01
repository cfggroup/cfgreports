package resources;

import java.awt.Image;
import java.sql.Date;

public class Consulta {
	
	private String CEDULA;
    private int NUM_FACTUR;
    private String CONCEPTO;
    private int VAL_IVA;
    private int VAL_IVA_F;
    private int VALOR;
    private int VALOR_F;
    private int TOTAL;
    private int TOTAL_F;
    private String NOMBRE;
    private String DIRECCION;
    private String TELEFONO;
    private Date FECHA_EMI;
    private Image LOGO_REPORTE;
    
    public Date getFECHA_EMI() {
		return FECHA_EMI;
	}
    public void setFECHA_EMI(Date fECHA_EMI) {
		FECHA_EMI = fECHA_EMI;
	}
	
    public String getCEDULA() {
		return CEDULA;
	}
	public void setCEDULA(String cEDULA) {
		CEDULA = cEDULA;
	}
	public int getNUM_FACTUR() {
		return NUM_FACTUR;
	}
	public void setNUM_FACTUR(int nUM_FACTUR) {
		NUM_FACTUR = nUM_FACTUR;
	}
	public String getCONCEPTO() {
		return CONCEPTO;
	}
	public void setCONCEPTO(String cONCEPTO) {
		CONCEPTO = cONCEPTO;
	}
	public int getVAL_IVA() {
		return VAL_IVA;
	}
	public void setVAL_IVA(int vAL_IVA) {
		VAL_IVA = vAL_IVA;
	}
	public int getVAL_IVA_F() {
		return VAL_IVA_F;
	}
	public void setVAL_IVA_F(int vAL_IVA_F) {
		VAL_IVA_F = vAL_IVA_F;
	}
	int getVALOR() {
		return VALOR;
	}
	public void setVALOR(int vALOR) {
		VALOR = vALOR;
	}
	public int getVALOR_F() {
		return VALOR_F;
	}
	public void setVALOR_F(int vALOR_F) {
		VALOR_F = vALOR_F;
	}
	public int getTOTAL() {
		return TOTAL;
	}
	public void setTOTAL(int tOTAL) {
		TOTAL = tOTAL;
	}
	public int getTOTAL_F() {
		return TOTAL_F;
	}
	public void setTOTAL_F(int tOTAL_F) {
		TOTAL_F = tOTAL_F;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public String getTELEFONO() {
		return TELEFONO;
	}
	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}
	public Image getLOGO_REPORTE() {
		return LOGO_REPORTE;
	}
	public void setLOGO_REPORTE(Image lOGO_REPORTE) {
		LOGO_REPORTE = lOGO_REPORTE;
	}
}
