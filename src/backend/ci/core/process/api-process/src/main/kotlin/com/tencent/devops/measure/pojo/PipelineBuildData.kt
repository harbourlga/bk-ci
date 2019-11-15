/*
 * Tencent is pleased to support the open source community by making BK-CI 蓝鲸持续集成平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CI 蓝鲸持续集成平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tencent.devops.measure.pojo

import com.tencent.devops.common.pipeline.enums.BuildStatus
import com.tencent.devops.common.pipeline.enums.StartType
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("流水线构建度量数据")
data class PipelineBuildData(
    @ApiModelProperty("流水线对应的项目id")
    val projectId: String,
    @ApiModelProperty("流水线的id")
    val pipelineId: String,
    @ApiModelProperty("模板的id")
    val templateId: String,
    @ApiModelProperty("流水线的这次构建的id")
    val buildId: String,
    @ApiModelProperty("流水线的启动时间")
    val beginTime: Long,
    @ApiModelProperty("流水线的结束时间")
    val endTime: Long,
    @ApiModelProperty("流水线的启动方式")
    val startType: StartType,
    @ApiModelProperty("流水线的启动用户")
    val buildUser: String,
    @ApiModelProperty("流水线的是否并行")
    val isParallel: Boolean,
    @ApiModelProperty("流水线的构建结果")
    val buildResult: BuildStatus,
    @ApiModelProperty("流水线Element结构")
    val pipeline: String,
    @ApiModelProperty("构建版本号")
    val buildNum: Int,
    @ApiModelProperty("元数据")
    val metaInfo: Map<String, Any>,
    @ApiModelProperty("错误类型", required = false)
    var errorType: String? = null,
    @ApiModelProperty("错误码标识", required = false)
    var errorCode: Int? = null,
    @ApiModelProperty("错误描述", required = false)
    var errorMsg: String? = null
)