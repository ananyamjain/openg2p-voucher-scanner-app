// Generated by view binder compiler. Do not edit!
package org.newlogic.smartscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.newlogic.smartscanner.R;

public final class ActivitySettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout arabiclayout;

  @NonNull
  public final ImageView arabicpic;

  @NonNull
  public final ImageView backspace;

  @NonNull
  public final TextView brandingText;

  @NonNull
  public final LinearLayout englishLayout;

  @NonNull
  public final ImageView englishpic;

  @NonNull
  public final ImageView landscapeCheck;

  @NonNull
  public final LinearLayout landscapeLayout;

  @NonNull
  public final LinearLayout languageLayout;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final ImageView portraitCheck;

  @NonNull
  public final LinearLayout portraitLayout;

  @NonNull
  public final TextView tvLanguage;

  @NonNull
  public final TextView tvOrientation;

  @NonNull
  public final TextView versionText;

  private ActivitySettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout arabiclayout, @NonNull ImageView arabicpic,
      @NonNull ImageView backspace, @NonNull TextView brandingText,
      @NonNull LinearLayout englishLayout, @NonNull ImageView englishpic,
      @NonNull ImageView landscapeCheck, @NonNull LinearLayout landscapeLayout,
      @NonNull LinearLayout languageLayout, @NonNull LinearLayout linearLayout2,
      @NonNull ImageView portraitCheck, @NonNull LinearLayout portraitLayout,
      @NonNull TextView tvLanguage, @NonNull TextView tvOrientation,
      @NonNull TextView versionText) {
    this.rootView = rootView;
    this.arabiclayout = arabiclayout;
    this.arabicpic = arabicpic;
    this.backspace = backspace;
    this.brandingText = brandingText;
    this.englishLayout = englishLayout;
    this.englishpic = englishpic;
    this.landscapeCheck = landscapeCheck;
    this.landscapeLayout = landscapeLayout;
    this.languageLayout = languageLayout;
    this.linearLayout2 = linearLayout2;
    this.portraitCheck = portraitCheck;
    this.portraitLayout = portraitLayout;
    this.tvLanguage = tvLanguage;
    this.tvOrientation = tvOrientation;
    this.versionText = versionText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.arabiclayout;
      LinearLayout arabiclayout = rootView.findViewById(id);
      if (arabiclayout == null) {
        break missingId;
      }

      id = R.id.arabicpic;
      ImageView arabicpic = rootView.findViewById(id);
      if (arabicpic == null) {
        break missingId;
      }

      id = R.id.backspace;
      ImageView backspace = rootView.findViewById(id);
      if (backspace == null) {
        break missingId;
      }

      id = R.id.branding_text;
      TextView brandingText = rootView.findViewById(id);
      if (brandingText == null) {
        break missingId;
      }

      id = R.id.englishLayout;
      LinearLayout englishLayout = rootView.findViewById(id);
      if (englishLayout == null) {
        break missingId;
      }

      id = R.id.englishpic;
      ImageView englishpic = rootView.findViewById(id);
      if (englishpic == null) {
        break missingId;
      }

      id = R.id.landscape_check;
      ImageView landscapeCheck = rootView.findViewById(id);
      if (landscapeCheck == null) {
        break missingId;
      }

      id = R.id.landscape_layout;
      LinearLayout landscapeLayout = rootView.findViewById(id);
      if (landscapeLayout == null) {
        break missingId;
      }

      id = R.id.language_layout;
      LinearLayout languageLayout = rootView.findViewById(id);
      if (languageLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = rootView.findViewById(id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.portrait_check;
      ImageView portraitCheck = rootView.findViewById(id);
      if (portraitCheck == null) {
        break missingId;
      }

      id = R.id.portrait_layout;
      LinearLayout portraitLayout = rootView.findViewById(id);
      if (portraitLayout == null) {
        break missingId;
      }

      id = R.id.tv_language;
      TextView tvLanguage = rootView.findViewById(id);
      if (tvLanguage == null) {
        break missingId;
      }

      id = R.id.tv_orientation;
      TextView tvOrientation = rootView.findViewById(id);
      if (tvOrientation == null) {
        break missingId;
      }

      id = R.id.version_text;
      TextView versionText = rootView.findViewById(id);
      if (versionText == null) {
        break missingId;
      }

      return new ActivitySettingsBinding((ConstraintLayout) rootView, arabiclayout, arabicpic,
          backspace, brandingText, englishLayout, englishpic, landscapeCheck, landscapeLayout,
          languageLayout, linearLayout2, portraitCheck, portraitLayout, tvLanguage, tvOrientation,
          versionText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
