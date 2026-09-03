class manufactura {

    private Integer CodigoProducto;
    private String Nombre;
    private String LineaProduccion;
    private Integer Cantidad;
    private Integer CantidadDefectuosa;
    private Double CostoUnitario;
    private Double MinutosUtilizados;
    private Double KilogramosMateriaPrima;
    private Integer MetaProduccion;
    private Double CostoProduccion;

    public manufactura(
            Integer CodigoProducto,
            String Nombre,
            String LineaProduccion,
            Integer Cantidad,
            Integer CantidadDefectuosa,
            Double CostoUnitario,
            Double MinutosUtilizados,
            Double KilogramosMateriaPrima,
            Integer MetaProduccion,
            Double CostoProduccion) {

        this.CodigoProducto = CodigoProducto;
        this.Nombre = Nombre;
        this.LineaProduccion = LineaProduccion;
        this.Cantidad = Cantidad;
        this.CantidadDefectuosa = CantidadDefectuosa;
        this.CostoUnitario = CostoUnitario;
        this.MinutosUtilizados = MinutosUtilizados;
        this.KilogramosMateriaPrima = KilogramosMateriaPrima;
        this.MetaProduccion = MetaProduccion;
        this.CostoProduccion = CostoProduccion;
    }

    public Integer getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(Integer CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLineaProduccion() {
        return LineaProduccion;
    }

    public void setLineaProduccion(String LineaProduccion) {
        this.LineaProduccion = LineaProduccion;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Integer getCantidadDefectuosa() {
        return CantidadDefectuosa;
    }

    public void setCantidadDefectuosa(Integer CantidadDefectuosa) {
        this.CantidadDefectuosa = CantidadDefectuosa;
    }

    public Double getCostoUnitario() {
        return CostoUnitario;
    }

    public void setCostoUnitario(Double CostoUnitario) {
        this.CostoUnitario = CostoUnitario;
    }

    public Double getMinutosUtilizados() {
        return MinutosUtilizados;
    }

    public void setMinutosUtilizados(Double MinutosUtilizados) {
        this.MinutosUtilizados = MinutosUtilizados;
    }

    public Double getKilogramosMateriaPrima() {
        return KilogramosMateriaPrima;
    }

    public void setKilogramosMateriaPrima(Double KilogramosMateriaPrima) {
        this.KilogramosMateriaPrima = KilogramosMateriaPrima;
    }

    public Integer getMetaProduccion() {
        return MetaProduccion;
    }

    public void setMetaProduccion(Integer MetaProduccion) {
        this.MetaProduccion = MetaProduccion;
    }

    public Double getCostoProduccion() {
        return CostoProduccion;
    }

    public void setCostoProduccion(Double CostoProduccion) {
        this.CostoProduccion = CostoProduccion;
    }

    @Override
    public String toString() {
        return "[CodigoProducto=" + CodigoProducto +
                ", Nombre=" + Nombre +
                ", LineaProduccion=" + LineaProduccion +
                ", Cantidad=" + Cantidad +
                ", CantidadDefectuosa=" + CantidadDefectuosa +
                ", CostoUnitario=$" + CostoUnitario +
                ", MinutosUtilizados=" + MinutosUtilizados +
                ", KilogramosMateriaPrima=" + KilogramosMateriaPrima +
                ", MetaProduccion=" + MetaProduccion +
                ", CostoProduccion=$" + CostoProduccion +
                "]";
    }
}
