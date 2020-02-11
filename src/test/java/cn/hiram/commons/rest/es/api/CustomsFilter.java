package cn.hiram.commons.rest.es.api;

import cn.hiram.commons.rest.es.filter.AbstractQueryDSLFilter;

/**
 * @author hiram
 * @date 2019/12/4 7:38 PM
 */
public class CustomsFilter extends AbstractQueryDSLFilter {

    @Override
    protected String handleForEsV17(String sourceQueryDSL) {
        return sourceQueryDSL;
    }

    @Override
    protected String handleForEsV23(String sourceQueryDSL) {
        return sourceQueryDSL;
    }

    @Override
    protected String handleForEsV56(String sourceQueryDSL) {
        System.out.println("sourceQueryDSL: \n" + sourceQueryDSL);
        return sourceQueryDSL;
    }
}
