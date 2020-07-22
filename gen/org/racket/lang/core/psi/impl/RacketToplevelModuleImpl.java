// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.racket.lang.core.psi.RacketElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.racket.lang.core.psi.*;

public class RacketToplevelModuleImpl extends ASTWrapperPsiElement implements RacketToplevelModule {

  public RacketToplevelModuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitToplevelModule(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RacketForm> getFormList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RacketForm.class);
  }

  @Override
  @NotNull
  public RacketModulePath getModulePath() {
    return findNotNullChildByClass(RacketModulePath.class);
  }

}