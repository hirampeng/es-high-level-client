package cn.hiram.commons.rest.es.enums;

/**
 * @author hiram
 * @date 2019/12/1 5:56 PM
 *
 * 表示ES的版本号
 */
public enum EsVersion {

    V17("v1.7"),
    V23("v2.3"),
    V56("v5.6"),
    DEFAULT("v5.6");

    private final String version;

    EsVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
    
    public static EsVersion VALUE(String value) {
        for (EsVersion esVersion : EsVersion.values()) {
            if (esVersion.version.equals(value)) {
                return esVersion;
            }
        }
        return null;
    }

}
