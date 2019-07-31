package happy.mjstudio.bottomsheetsample

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyModalBottomSheet : BottomSheetDialogFragment() {

    /**
     * 현재 BottomSheet(Fragment)의 Theme를 얻어오는 메서드를 오버라이딩 해서 우리가 커스텀하게 정의한
     *
     * RoundBottomSheetDialog 라는 Theme.Design.Light.BottomSheetDialog 스타일을 상속한 스타일을 반환하게 해준다.
     */
    override fun getTheme(): Int = R.style.RoundBottomSheetDialog

    /**
     * 커스텀한 Dialog 객체를 반환해주기 위해 BottomSheetDialog 대화상자를 반환해준다.
     *
     * 여기서 중요한 것은 우리가 [getTheme] 메서드를 오버라이딩 해서 반환해주는 Theme 를 이용해서 [BottomSheetDialog]를 생성해주어서
     *
     * 우리가 원하는 Style 대로 BottomSheet 를 동작시킬 수 있다는 것이다.
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog = BottomSheetDialog(activity!!, theme)

    /**
     * 여타 [Fragment] 와 같이 onCreateView 로 뷰를 만들어준다.
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bottom_sheet_modal,container,false)
    }

    /**
     * Modal Bottom Sheet 이 Dismiss 될 때 호출되는 콜백
     */
    override fun onDismiss(dialog: DialogInterface?) {
        super.onDismiss(dialog)
    }
}