package com.a10miaomiao.bilimiao.comm.entity.bangumi

data class BangumiInfo (
    val cover: String,
    val episodes: List<EpisodeInfo>,
    val evaluate: String,
    val is_new_danmaku: Int,
    val link: String,
    val media_id: Int,
    val mid: Int,
    val mode: Int,
    val newest_ep: NewestEpisodeInfo,
    val publish: BangumiPublishInfo,
    val rating: BangumiRatingInfo,
    val record: String,
    val rights: BangumiRightsInfo,
    val season_id: String,
    val season_status: Int,
    val season_title: String,
    val season_type: Int,
    val seasons: List<SeasonInfo>,
    val series_id: Int,
    val share_url: String,
    val square_cover: String,
    val stat: BangumiStatXInfo,
    val title: String,
    val total_ep: Int,
    val user_status: BangumiUserStatusInfo,
)