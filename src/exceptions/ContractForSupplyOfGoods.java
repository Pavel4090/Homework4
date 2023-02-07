package exceptions;

import java.util.Date;
import java.util.Objects;

public class ContractForSupplyOfGoods extends Document {

    private String goodsType;
    private int goodsAmount;

    public ContractForSupplyOfGoods(Date documentDate, String documentNumber, String goodsType, int goodsAmount) {
        super(documentDate, documentNumber);
        this.goodsType = goodsType;
        this.goodsAmount = goodsAmount;
    }

    public ContractForSupplyOfGoods() {
    }

    @Override
    public String toString() {
        return "SupplyGoodsContract{" +
                "goodsType='" + goodsType + '\'' +
                ", goodsAmount=" + goodsAmount + ", " +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractForSupplyOfGoods)) return false;
        if (!super.equals(o)) return false;
        ContractForSupplyOfGoods that = (ContractForSupplyOfGoods) o;
        return goodsAmount == that.goodsAmount && goodsType.equals(that.goodsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), goodsType, goodsAmount);
    }
}
