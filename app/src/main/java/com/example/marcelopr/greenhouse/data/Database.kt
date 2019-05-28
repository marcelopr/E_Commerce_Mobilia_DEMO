package com.example.marcelopr.greenhouse.data

import android.content.Context
import com.example.marcelopr.greenhouse.R
import com.example.marcelopr.greenhouse.domain.Category
import com.example.marcelopr.greenhouse.domain.Product


class Database {

    companion object {

        fun getCategories(context: Context) = listOf(
            Category(0, context.getString(R.string.label_all), R.drawable.ic_house),
            Category(1, context.getString(R.string.label_cabinet), R.drawable.ic_cabinet),
            Category(2, context.getString(R.string.label_chair), R.drawable.ic_chair),
            Category(3, context.getString(R.string.label_bed), R.drawable.ic_bed),
            Category(5, context.getString(R.string.label_table), R.drawable.ic_table),
            Category(4, context.getString(R.string.label_sofa), R.drawable.ic_sofa)
        )

        val products_list = mutableListOf<Product>(

            Product(
                2,
                "Cadeira Camélia",
                "Cadeira com base em madeira maciça tingida, concha inteira para assento e encosto, com costas levemente arqueada para maior ergonomia. Encosto e assentos estofados com espumas que fornecem alto grau de conforto.",
                200.00,
                91,
                51,
                59,
                R.drawable.img_cadeira_camelia
            ),
            Product(
                2,
                "Cadeira Iolanda",
                "Pés em madeira maciça tingida, estrutura interna do estofado em madeira maciça. Encosto e assentos estofados com espumas que fornecem alto grau de conforto.",
                220.00,
                87,
                41,
                54,
                R.drawable.img_cadeira_iolanda
            ),
            Product(
                2,
                "Cadeira Pinhais",
                "Cadeira de estrutura em madeira maciça, encosto formato ergonomico de madeira e assento estofado.",
                330.00,
                82,
                47,
                42,
                R.drawable.img_cadeira_pinhais
            ),
            Product(
                2,
                "Cadeira Rosini",
                "Produzida com a base em madeira maciça de eucalipto, estofamento de alta densidade e revestimento com tecido 100% algodão, qualidade é o que ela tem de sobra.",
                540.00,
                80,
                47,
                56,
                R.drawable.img_cadeira_rosini
            ),
            Product(
                2,
                "Cadeira Uma",
                "Bastante leve, mas muito estável e resistente, ela tem a estrutura feita com madeira de eucalipto e o assento é produzido em mdf laqueado.",
                185.00,
                84,
                44,
                49,
                R.drawable.img_cadeira_uma
            ),
            Product(
                2,
                "Cadeira Filomena",
                "Ela tem o design é básico, mas cheio de estilo, suas linhas são retas e elegantes, dando mais leveza ao desenho. Além disso, ela é mega estável e resistente. É produzida em pinus envernizado e o assento é revestido em couro sintético.",
                409.00,
                84,
                45,
                50,
                R.drawable.img_cadeira_filomena
            ),
            Product(
                2,
                "Cadeira Regina",
                "A base, que é produzida em madeira maciça de eucalipto envernizada, tem as extremidades afinadas, combinando perfeitamente com o braço, que é curvado. Inclusive, ele é feito em madeira multilaminda, assim como o encosto. Já o assento, tem espuma D-28 revestida com tecido.",
                600.00,
                84,
                61,
                65,
                R.drawable.img_cadeira_regina
            ),
            Product(
                2,
                "Cadeira Elis",
                "Feita em madeira de eucalipto envernizado. Já o assento e encosto em MDF estofado, ambos revestidos por tecido.",
                605.00,
                86,
                56,
                60,
                R.drawable.img_cadeira_elis
            ),
            Product(
                2,
                "Cadeira Marconi",
                "Madeira de eucalipto ergonomicamente projetada. Encosto e assento anatômico revestido com espuma e tecidos de alta qualidade. Acabamento natural.",
                945.00,
                77,
                58,
                59,
                R.drawable.img_cadeira_marconi
            ),
            Product(
                2,
                "Cadeira Biscoito Fino",
                " A estrutura dela é produzida em eucalipto, sendo a base madeira maciça e torneada. O assento e o encosto têm espuma D-28 e revestimento com tecido composto 100% algodão. Além da qualidade, ainda tem esse detalhe botonê que dá um charme todo especial.",
                605.00,
                82,
                46,
                58,
                R.drawable.img_cadeira_biscoito_fino
            ),

            Product(
                5,
                "Mesa de Centro Redonda Biscoito Fino",
                "Ela é produzida com a base em madeira de eucalipto envernizado. Já o tampo, é feito em mdf laqueado. Inclusive, tem disponível um monte de cores diferentes, dá uma olhada aqui do lado e escolha a sua preferida.",
                560.00,
                32,
                70,
                70,
                R.drawable.img_mesa_centro_redonda_biscoito_fino
            ),
            Product(
                5,
                "Mesa de Centro Redonda Dotta",
                "A Mesa de Centro Dotta é cheia de personalidade e com certeza trará bom humor ao seu dia a dia! Ela tem o tampo largo feito em MDF laminado com madeira natural esmaltada. Já os pés são feitos com madeira maciça de eucalipto, o que significa um detalhe exclusivo para cada peça, marcado pelos diferentes veios, nós e fibras da espécie.",
                604.90,
                34,
                80,
                80,
                R.drawable.img_mesa_centro_redonda_dotta
            ),
            Product(
                5,
                "Mesa Dobrável Presto",
                "A Mesa Dobrável Presto é ideal para quem busca por um móvel prático. Além de caber em qualquer cantinho quando não usada, essa mesa para jardim acomoda confortavelmente 4 pessoas e pode ser combinada com a Cadeira Dobrável Presto. O formato do tampo foge do tradicional e possui cantos arredondados, trazendo muito mais segurança e estilo para o espaço",
                475.00,
                76,
                83,
                83,
                R.drawable.img_mesa_dobravel_presto
            ),
            Product(
                5,
                "Mesa de Jantar Dinda",
                "Ela tem a base produzida em eucalipto maciço e escovado, com o acabamento em cera. Aliás, esse processo evidencia bastante os veios naturais da madeira. Já o tampo é feito em mdf laqueado. Outro detalhe importante são os feltros de proteção na base. Isso, quer dizer que ela não risca e nem estraga o seu piso, seja ele qual for.",
                620.00,
                76,
                90,
                90,
                R.drawable.img_mesa_jantar_dinda
            ),
            Product(
                5,
                "Mesa de Jantar Guaporé",
                "Esta aqui é a Mesa Guaporé, uma bela e estruturada representante, produzida com madeira de eucalipto ripada e acabamento em verniz stain. Uma coisa é certa: ela vai elevar o nível da sua decoração.",
                890.00,
                77,
                160,
                85,
                R.drawable.img_mesa_jantar_guapore
            ),
            Product(
                5,
                "Mesa de Jantar Redonda Biscoito Fino",
                "Ela é produzida com a base em madeira de eucalipto envernizado e agora apresentamos uma nova opção de tampo: o redondo. Ela agrega todo mundo e ocupa menos espaço!",
                1220.00,
                75,
                120,
                120,
                R.drawable.img_mesa_jantar_redonda_biscoito_fino
            ),
            Product(
                5,
                "Mesa de Jantar Redonda Veraneio",
                "Inspirada nas tradicionais mesas de varanda, a Mesa Veraneio traz o ripado de eucalipto com o toque moderno da prática bandeja auxiliar giratória, fabricada em MDF laqueado, que fica no centro do tampo.",
                1650.00,
                74,
                160,
                160,
                R.drawable.img_mesa_jantar_redonda_veraneio
            ),
            Product(
                5,
                "Mesa Lateral Redonda Eme",
                "A Mesa Lateral Eme vai te conquistar! Ela é cheia de personalidade, tem o design moderno e o estilo todo descolado. A base é feita de Pinus tingido e reforçada estruturalmente, garantindo uma ótima estabilidade, além da resistência, claro. Já o tampo é produzido em MDF. Tem mais: a montagem é super fácil, assim, você não fica perdendo tempo.",
                650.00,
                50,
                50,
                50,
                R.drawable.img_mesa_lateral_redonda_eme
            ),
            Product(
                5,
                "Mesa Lateral Redonda Valença",
                "Ela é compacta e o design é clean, ou seja, combina com diferentes estilos de decoração, nos mais variados ambientes da casa. Sem falar que é extremamente fácil de montar. No quesito qualidade ela também arrasa: a base é torneada e produzida em Pinus, quando o tampo é feito em mdf, ambos com o acabamento laqueado.",
                180.00,
                60,
                40,
                40,
                R.drawable.img_mesa_lateral_redonda_valenca
            ),
            Product(
                5,
                "Mesa Morumbi",
                "Ela é produzida com o tampo em mdf laqueado. Já a base, que também é o acabamento lateral, é feita em madeira de pinus envernizada. O detalhe interessante sobre ela é que o seu desenho enfatiza a força da estrutura, macete que muitas vezes é usado por arquitetos modernistas, como Oscar Niemeyer.",
                550.00,
                76,
                160,
                80,
                R.drawable.img_mesa_morumbi
            )
            )

    }

}