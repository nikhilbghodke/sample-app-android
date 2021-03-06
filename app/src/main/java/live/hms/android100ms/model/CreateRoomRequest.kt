package live.hms.android100ms.model

import com.google.gson.annotations.SerializedName

data class CreateRoomRequest(
  @SerializedName("room_name") val roomName: String,
  @SerializedName("env") val env: String,
  @SerializedName("recording_info") val recordingInfo: RecordingInfo
)