/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package compatibility

import net.mamoe.mirai.message.data.Message
import net.mamoe.mirai.message.data.PlainText
import org.junit.Test


internal class TestKotlinCompatibility {

    @Test
    fun testMessageChain() {
        val x = PlainText("te") + PlainText("st")

        println(Message::class.java.declaredMethods.joinToString("\n"))
        println()
        println(x::class.java.declaredMethods.joinToString("\n"))
    }
}