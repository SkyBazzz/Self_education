package java8.collections.lambdas_and_streams.asset;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AssetDemo {
    public static void main(String[] args) {
        final List<Asset> assets = Arrays.asList(
                new Asset(AssetType.BOND, 1000),
                new Asset(AssetType.BOND, 2000),
                new Asset(AssetType.STOCK, 3000),
                new Asset(AssetType.STOCK, 4000));

        System.out.println("Total of not assets: " + totalAssetValues(assets, asset -> false));
        System.out.println("Total of Bond assets: " + totalAssetValues(assets, asset -> asset.getType() == AssetType.BOND));
        System.out.println("Total of Stock assets: " + totalAssetValues(assets, asset -> asset.getType() == AssetType.STOCK));
        System.out.println("Total of all assets: " + totalAssetValues(assets, asset -> true));
    }

    public static int totalAssetValues(final List<Asset> assets, final Predicate<Asset> assetSelector) {
        return assets.stream()
                     .filter(assetSelector)
                     .mapToInt(Asset::getValue)
                     .sum();
    }
}