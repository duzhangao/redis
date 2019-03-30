package com.dza.javaee.dao.daoimpl;

import com.dza.javaee.dao.ProviceDao;
import com.dza.javaee.domain.Province;
import com.dza.javaee.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProviceDaoimpl implements ProviceDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Province> findall() {
         String sql="select * from province";
        return template.query(sql,new BeanPropertyRowMapper<Province>(Province.class));
    }
}
