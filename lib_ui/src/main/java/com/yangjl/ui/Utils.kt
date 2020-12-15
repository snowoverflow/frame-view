package com.yangjl.ui

import android.content.Context
import android.widget.Toast

/**
 *
 * @ProjectName:    FrameView
 * @Package:        com.yangjl.ui
 * @ClassName:      Utils
 * @Description:
 * @Author:         yangjl
 * @CreateDate:     2020/12/15 10:34
 * @UpdateUser:     更新者：
 * @UpdateDate:     2020/12/15 10:34
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */

fun toast(context: Context, msg: String) {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}