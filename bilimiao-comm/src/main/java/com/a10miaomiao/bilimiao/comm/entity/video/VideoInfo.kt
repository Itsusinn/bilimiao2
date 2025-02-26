package com.a10miaomiao.bilimiao.comm.entity.video

import android.os.Parcelable
import com.a10miaomiao.bilimiao.comm.entity.bangumi.SeasonInfo
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class VideoInfo(
    val aid: Long,
    val attribute: Int?,
    val bvid: String,
    val cid: Long, // 视频1P cid
//    val cm_config: CmConfig,
//    val cms: List<Cm>,
    val copyright: Int,
    val ctime: Long,
    var desc: String,
//    val dimension: Dimension,
//    val dislike_reasons: List<DislikeReason>,
    val dm_seg: Int,
    val duration: Int,
    val `dynamic`: String,
//    val elec: Elec,
    val owner: VideoOwnerInfo,
//    val owner_ext: OwnerExt,
    val pages: List<VideoPageInfo>, // 视频分P列表
    val pic: String,
    val pubdate: Long, // 稿件发布时间 秒级时间戳
    val relates: List<VideoRelateInfo>?,
    var req_user: VideoReqUserInfo,
//    val rights: VideoRelateInfo,
    val season: SeasonInfo?,
    val staff: List<VideoStaffInfo>?,
    var stat: VideoStatInfo,
    val state: Int,
    val tag: List<VideoTagInfo>,
    val tid: Int,
    val title: String,
    val tname: String,
    val videos: Int,
    val view_at: Long? // 历史记录的观看时间
) : Parcelable