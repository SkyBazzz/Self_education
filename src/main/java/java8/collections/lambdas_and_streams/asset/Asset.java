package java8.collections.lambdas_and_streams.asset;

public class Asset {

    private final AssetType type;
    private final int value;

    public Asset(final AssetType assetType, final int assetValue) {
        type = assetType;
        value = assetValue;
    }

    public AssetType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}