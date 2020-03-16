package com.alekseioshurkovdeveloper.about.domain

import com.alekseioshurkovdeveloper.about.domain.converter.AboutDomainConverter
import org.junit.Before

/**
 * Test on class [AboutDomainConverter]
 */
class AboutDomainConverterTest {

    private lateinit var converter: AboutDomainConverter

    @Before
    fun setUp(){
        converter =
            AboutDomainConverter()
    }


}