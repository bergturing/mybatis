package com.berg.base.xmlmappers.insert;

import com.berg.base.xmlmappers.insert.dto.MaleAttr;
import com.berg.base.xmlmappers.insert.mapper.MaleAttrMapper;
import com.berg.utils.OutputUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MaleAttrMapperTest {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void before() throws IOException {
        String resource = "config/base/xmlmappers/insert/mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testSelect(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MaleAttrMapper mapper = sqlSession.getMapper(MaleAttrMapper.class);

        List<MaleAttr> maleAttrList = mapper.select(null);

        OutputUtil.outputlist(maleAttrList);

        sqlSession.close();
    }

    @Test
    public void testInsert(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MaleAttrMapper mapper = sqlSession.getMapper(MaleAttrMapper.class);

        MaleAttr maleAttr = new MaleAttr();
        maleAttr.setStudentId(1L);

        System.out.println(mapper.insert(maleAttr));

        System.out.println(maleAttr);

        OutputUtil.outputlist(mapper.select(maleAttr));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testInsertBack(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MaleAttrMapper mapper = sqlSession.getMapper(MaleAttrMapper.class);

        MaleAttr maleAttr = new MaleAttr();
        maleAttr.setStudentId(1L);

        System.out.println(mapper.insertBack(maleAttr));

        System.out.println(maleAttr);

        OutputUtil.outputlist(mapper.select(maleAttr));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testInsertSelect(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MaleAttrMapper mapper = sqlSession.getMapper(MaleAttrMapper.class);

        MaleAttr maleAttr = new MaleAttr();
        maleAttr.setStudentId(1L);

        System.out.println(mapper.insertSelect(maleAttr));

        System.out.println(maleAttr);

        OutputUtil.outputlist(mapper.select(maleAttr));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testInsertSelectBack(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MaleAttrMapper mapper = sqlSession.getMapper(MaleAttrMapper.class);

        MaleAttr maleAttr = new MaleAttr();
        maleAttr.setStudentId(1L);

        System.out.println(mapper.insertSelectBack(maleAttr));

        System.out.println(maleAttr);

        OutputUtil.outputlist(mapper.select(maleAttr));

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testInsertSelectBackUseSelectKey(){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        MaleAttrMapper mapper = sqlSession.getMapper(MaleAttrMapper.class);

        MaleAttr maleAttr = new MaleAttr();
        maleAttr.setStudentId(1L);

        System.out.println(mapper.insertSelectBackUseSelectKey(maleAttr));

        System.out.println(maleAttr);

        OutputUtil.outputlist(mapper.select(maleAttr));

        sqlSession.commit();

        sqlSession.close();
    }
}
