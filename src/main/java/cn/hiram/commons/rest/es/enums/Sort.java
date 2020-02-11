package cn.hiram.commons.rest.es.enums;

/**
 * @author hiram
 * @date 2019/12/3 5:47 PM
 *
 * 排序规则
 */
public enum  Sort {

    ASC("asc"),
    DESC("desc");

    private final String order;

    Sort(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public static Sort VALUE(String value) {
        for (Sort sort : Sort.values()) {
            if (sort.order.equals(value)) {
                return sort;
            }
        }
        return null;
    }

}
